/*
 * This file is generated by jOOQ.
*/
package db.generated.tables;


import db.generated.College;
import db.generated.Keys;
import db.generated.tables.records.RelativeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Relative extends TableImpl<RelativeRecord> {

    private static final long serialVersionUID = -1105867425;

    /**
     * The reference instance of <code>college.relative</code>
     */
    public static final Relative RELATIVE = new Relative();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RelativeRecord> getRecordType() {
        return RelativeRecord.class;
    }

    /**
     * The column <code>college.relative.id</code>.
     */
    public final TableField<RelativeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>college.relative.surname</code>.
     */
    public final TableField<RelativeRecord, String> SURNAME = createField("surname", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>college.relative.name</code>.
     */
    public final TableField<RelativeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>college.relative.rodstvo</code>.
     */
    public final TableField<RelativeRecord, String> RODSTVO = createField("rodstvo", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>college.relative.address</code>.
     */
    public final TableField<RelativeRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * The column <code>college.relative.work_place</code>.
     */
    public final TableField<RelativeRecord, String> WORK_PLACE = createField("work_place", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * The column <code>college.relative.job</code>.
     */
    public final TableField<RelativeRecord, String> JOB = createField("job", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * The column <code>college.relative.stud_id</code>.
     */
    public final TableField<RelativeRecord, Integer> STUD_ID = createField("stud_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>college.relative</code> table reference
     */
    public Relative() {
        this("relative", null);
    }

    /**
     * Create an aliased <code>college.relative</code> table reference
     */
    public Relative(String alias) {
        this(alias, RELATIVE);
    }

    private Relative(String alias, Table<RelativeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Relative(String alias, Table<RelativeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return College.COLLEGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RelativeRecord> getPrimaryKey() {
        return Keys.KEY_RELATIVE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RelativeRecord>> getKeys() {
        return Arrays.<UniqueKey<RelativeRecord>>asList(Keys.KEY_RELATIVE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RelativeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RelativeRecord, ?>>asList(Keys.RELATIVE_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relative as(String alias) {
        return new Relative(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Relative rename(String name) {
        return new Relative(name, null);
    }
}