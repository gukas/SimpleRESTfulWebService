package hello;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import db.generated.enums.StudentSex;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static db.generated.Tables.*;

import java.sql.*;

import org.jooq.*;
import org.jooq.impl.*;

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

    @RequestMapping("/1")
    public Result get1() {
        ArrayList<String> studList = new ArrayList<String>();
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            org.jooq.Result<Record3<String, String, BigDecimal>> result = create
                    .select(STUDENT.NAME, STUDENT.SURNAME, STUDENT.MARK)
                    .from(STUDENT)
                    .fetch();
            for (Record3 rec: result
            ) {
                studList.add(String.join(" ", rec.getValue(STUDENT.NAME),rec.getValue(STUDENT.SURNAME), rec.getValue(STUDENT.MARK).toString()));
            }
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), studList.toString());
    }

    @RequestMapping("/2")
    public Result get2() {
        ArrayList<String> studList = new ArrayList<String>();
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            org.jooq.Result<Record4<String, String, BigDecimal, String>> result = create
                    .select(STUDENT.NAME, STUDENT.SURNAME, STUDENT.MARK, GROUP_ST.NOMER)
                    .from(STUDENT)
                    .leftJoin(GROUP_ST)
                    .on(STUDENT.GROUP_ID.equal(GROUP_ST.ID))
                    .orderBy(STUDENT.SURNAME)
                    .fetch();
            for (Record4 rec: result) {
                studList.add(String.join(" ",
                        rec.getValue(STUDENT.SURNAME),
                        rec.getValue(STUDENT.NAME),
                        rec.getValue(STUDENT.MARK).toString(),
                        rec.getValue(GROUP_ST.NOMER)));
            }
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), studList.toString());
    }

    @RequestMapping("/3")
    public Result get3() {
        ArrayList<String> studList = new ArrayList<String>();
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            org.jooq.Result<Record7<String, String, java.sql.Date, BigDecimal, String, Integer, String>> result = create
                    .select(STUDENT.NAME, STUDENT.SURNAME, STUDENT.BIRTHDAY, STUDENT.MARK,
                            GROUP_ST.NOMER, SUB_FACULTY.NOMER, SUB_FACULTY.NAME)
                    .from(STUDENT)
                    .leftJoin(GROUP_ST)
                    .on(STUDENT.GROUP_ID.equal(GROUP_ST.ID))
                    .leftJoin(SUB_FACULTY)
                    .on(GROUP_ST.SUB_FAC_ID.equal(SUB_FACULTY.ID))
                    .orderBy(STUDENT.SURNAME, STUDENT.BIRTHDAY)
                    .fetch();
            for (Record7 rec: result) {
                studList.add(String.join(" ",
                        rec.getValue(STUDENT.SURNAME),
                        rec.getValue(STUDENT.NAME),
                        rec.getValue(STUDENT.BIRTHDAY).toString(),
                        rec.getValue(STUDENT.MARK).toString(),
                        rec.getValue(GROUP_ST.NOMER),
                        rec.getValue(SUB_FACULTY.NOMER).toString(),
                        rec.getValue(SUB_FACULTY.NAME))
                );
            }
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), studList.toString());
    }

    // Вероятно проблема с кодировкой, запрос не работает как нужно
    @RequestMapping("/4")
    public Result get4() {
        ArrayList<String> studList = new ArrayList<String>();
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            org.jooq.Result<Record3<String, String, String>> result = create
                    .select(STUDENT.NAME, STUDENT.SURNAME, GROUP_ST.NOMER)
                    .from(STUDENT)
                    .leftJoin(GROUP_ST)
                    .on(STUDENT.GROUP_ID.equal(GROUP_ST.ID))
                    .where(STUDENT.NATIONALITY.notIn("Русский", "Русская"))
                    .fetch();
            String sql_req = create
                    .select(STUDENT.NAME, STUDENT.SURNAME, GROUP_ST.NOMER)
                    .from(STUDENT)
                    .leftJoin(GROUP_ST)
                    .on(STUDENT.GROUP_ID.equal(GROUP_ST.ID))
                    .where(STUDENT.NATIONALITY.notIn("Русский", "Русская"))
                    .getSQL();
            System.out.println(sql_req);
            for (Record3 rec: result) {
                studList.add(String.join(" ",
                        rec.getValue(STUDENT.NAME),
                        rec.getValue(STUDENT.SURNAME),
                        rec.getValue(GROUP_ST.NOMER))
                );
            }
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), studList.toString());
    }

    @RequestMapping("/5")
    public Result get5() {
        String studCount = "";
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            Record result = create
                    .select(DSL.count().as("COUNT"))
                    .from(STUDENT)
                    .fetchOne();
            studCount = result.getValue("COUNT").toString();
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), studCount);
    }

    @RequestMapping("/6")
    public Result get6() {
        String studCount = "";
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            Record result = create
                    .select(DSL.count().as("COUNT"))
                    .from(STUDENT)
                    .where(STUDENT.MARK.between(BigDecimal.valueOf(4.0), BigDecimal.valueOf(4.9)))
                    .fetchOne();
            studCount = result.getValue("COUNT").toString();
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), studCount);
    }

    // не работает
    @RequestMapping("/7")
    public Result get7() {
        String studCount = "";
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            Record result = create
                    .select(DSL.count().as("COUNT"))
                    .from(STUDENT)
                    .where(STUDENT.MARK.between(BigDecimal.valueOf(4.0), BigDecimal.valueOf(4.9)))
                    .and(STUDENT.SEX.eq(StudentSex.Ж))
                    .fetchOne();
            studCount = result.getValue("COUNT").toString();
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), studCount);
    }

    @RequestMapping("/8")
    public Result get8() {
        ArrayList<String> studList = new ArrayList<String>();
        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            org.jooq.Result<Record2<BigDecimal, Integer>> result = create
                    .select(STUDENT.MARK, DSL.count().as("COUNT"))
                    .from(STUDENT)
                    .groupBy(STUDENT.MARK)
                    .fetch();
            for (Record2 rec: result) {
                studList.add(String.join(" ",
                        rec.getValue(STUDENT.MARK).toString(),
                        rec.getValue("COUNT").toString())
                );
            }
        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }

        return new Result(counter.incrementAndGet(), studList.toString());
    }
}
