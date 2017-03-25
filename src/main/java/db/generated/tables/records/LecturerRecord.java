/*
 * This file is generated by jOOQ.
*/
package db.generated.tables.records;


import db.generated.tables.Lecturer;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class LecturerRecord extends UpdatableRecordImpl<LecturerRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = 716723300;

    /**
     * Setter for <code>college.lecturer.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>college.lecturer.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>college.lecturer.surname</code>.
     */
    public void setSurname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>college.lecturer.surname</code>.
     */
    public String getSurname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>college.lecturer.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>college.lecturer.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>college.lecturer.sub_fac_id</code>.
     */
    public void setSubFacId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>college.lecturer.sub_fac_id</code>.
     */
    public Integer getSubFacId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Lecturer.LECTURER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Lecturer.LECTURER.SURNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Lecturer.LECTURER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Lecturer.LECTURER.SUB_FAC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSurname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSubFacId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value2(String value) {
        setSurname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value4(Integer value) {
        setSubFacId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord values(Integer value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LecturerRecord
     */
    public LecturerRecord() {
        super(Lecturer.LECTURER);
    }

    /**
     * Create a detached, initialised LecturerRecord
     */
    public LecturerRecord(Integer id, String surname, String name, Integer subFacId) {
        super(Lecturer.LECTURER);

        set(0, id);
        set(1, surname);
        set(2, name);
        set(3, subFacId);
    }
}
