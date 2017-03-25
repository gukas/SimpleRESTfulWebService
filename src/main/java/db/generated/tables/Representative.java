/*
 * This file is generated by jOOQ.
*/
package db.generated.tables;


import db.generated.College;
import db.generated.Keys;
import db.generated.tables.records.RepresentativeRecord;

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
public class Representative extends TableImpl<RepresentativeRecord> {

    private static final long serialVersionUID = -343731358;

    /**
     * The reference instance of <code>college.representative</code>
     */
    public static final Representative REPRESENTATIVE = new Representative();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RepresentativeRecord> getRecordType() {
        return RepresentativeRecord.class;
    }

    /**
     * The column <code>college.representative.id</code>.
     */
    public final TableField<RepresentativeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>college.representative.surname</code>.
     */
    public final TableField<RepresentativeRecord, String> SURNAME = createField("surname", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>college.representative.name</code>.
     */
    public final TableField<RepresentativeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>college.representative.job</code>.
     */
    public final TableField<RepresentativeRecord, String> JOB = createField("job", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>college.representative.ent_id</code>.
     */
    public final TableField<RepresentativeRecord, Integer> ENT_ID = createField("ent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>college.representative</code> table reference
     */
    public Representative() {
        this("representative", null);
    }

    /**
     * Create an aliased <code>college.representative</code> table reference
     */
    public Representative(String alias) {
        this(alias, REPRESENTATIVE);
    }

    private Representative(String alias, Table<RepresentativeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Representative(String alias, Table<RepresentativeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<RepresentativeRecord> getPrimaryKey() {
        return Keys.KEY_REPRESENTATIVE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RepresentativeRecord>> getKeys() {
        return Arrays.<UniqueKey<RepresentativeRecord>>asList(Keys.KEY_REPRESENTATIVE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RepresentativeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RepresentativeRecord, ?>>asList(Keys.REPRESENTATIVE_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Representative as(String alias) {
        return new Representative(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Representative rename(String name) {
        return new Representative(name, null);
    }
}