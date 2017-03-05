package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static db.generated.Tables.*;

import java.sql.*;

import org.jooq.*;
import org.jooq.impl.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gukserg on 04.03.17.
 */
@RestController
public class Controller {

    private static final String greetingTemplate = "Hello, %s!";
    private static final String getAuthorTemplate = "Got author %s %s!";
    private static final String addAuthorTemplate = "Add author %s %s - id %s";
    private final AtomicLong counter = new AtomicLong();

    private final String userName = "root";
    private final String password = "root";
    private final String url = "jdbc:mysql://localhost:3306/library?serverTimezone=UTC&useSSL=false";

    @RequestMapping("/greeting")
    public Result greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Result(counter.incrementAndGet(), String.format(greetingTemplate, name));
    }

    @RequestMapping("/get-quote")
    public Result getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);

        return new Result(counter.incrementAndGet(), quote.getValue().getQuote());
    }

    @RequestMapping("/get-author")
    public Result getAuthor(@RequestParam(value = "id") int id) {
        String firstName = "John";
        String lastName = "Doe";

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            Record result = create.select(AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME).from(AUTHOR).where(AUTHOR.ID.eq(id)).fetchOne();
            if (result != null) {
                firstName = result.getValue(AUTHOR.FIRST_NAME);
                lastName = result.getValue(AUTHOR.LAST_NAME);
            }
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), String.format(getAuthorTemplate, firstName, lastName));
    }

    @RequestMapping("/add-author")
    public Result addAuthor(@RequestParam(value = "id") int id
            , @RequestParam(value = "name") String firstName
            , @RequestParam(value = "surname") String lastName) {

        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            create.insertInto(AUTHOR)
                    .columns(AUTHOR.ID, AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME)
                    .values(id,firstName,lastName)
                    .onDuplicateKeyUpdate()
                    .set(AUTHOR.FIRST_NAME, firstName)
                    .set(AUTHOR.LAST_NAME, lastName).execute();
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), String.format(addAuthorTemplate, firstName, lastName, id));
    }
}
