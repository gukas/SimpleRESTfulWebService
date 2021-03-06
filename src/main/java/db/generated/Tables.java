/*
 * This file is generated by jOOQ.
*/
package db.generated;


import db.generated.tables.Abroad;
import db.generated.tables.Assignment;
import db.generated.tables.Enterprise;
import db.generated.tables.GroupSt;
import db.generated.tables.Lecturer;
import db.generated.tables.Payment;
import db.generated.tables.Profession;
import db.generated.tables.Relative;
import db.generated.tables.Representative;
import db.generated.tables.Student;
import db.generated.tables.SubFaculty;
import db.generated.tables.VarAssignment;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in college
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>college.abroad</code>.
     */
    public static final Abroad ABROAD = db.generated.tables.Abroad.ABROAD;

    /**
     * The table <code>college.assignment</code>.
     */
    public static final Assignment ASSIGNMENT = db.generated.tables.Assignment.ASSIGNMENT;

    /**
     * The table <code>college.enterprise</code>.
     */
    public static final Enterprise ENTERPRISE = db.generated.tables.Enterprise.ENTERPRISE;

    /**
     * The table <code>college.group_st</code>.
     */
    public static final GroupSt GROUP_ST = db.generated.tables.GroupSt.GROUP_ST;

    /**
     * The table <code>college.lecturer</code>.
     */
    public static final Lecturer LECTURER = db.generated.tables.Lecturer.LECTURER;

    /**
     * The table <code>college.payment</code>.
     */
    public static final Payment PAYMENT = db.generated.tables.Payment.PAYMENT;

    /**
     * The table <code>college.profession</code>.
     */
    public static final Profession PROFESSION = db.generated.tables.Profession.PROFESSION;

    /**
     * The table <code>college.relative</code>.
     */
    public static final Relative RELATIVE = db.generated.tables.Relative.RELATIVE;

    /**
     * The table <code>college.representative</code>.
     */
    public static final Representative REPRESENTATIVE = db.generated.tables.Representative.REPRESENTATIVE;

    /**
     * The table <code>college.student</code>.
     */
    public static final Student STUDENT = db.generated.tables.Student.STUDENT;

    /**
     * The table <code>college.sub_faculty</code>.
     */
    public static final SubFaculty SUB_FACULTY = db.generated.tables.SubFaculty.SUB_FACULTY;

    /**
     * The table <code>college.var_assignment</code>.
     */
    public static final VarAssignment VAR_ASSIGNMENT = db.generated.tables.VarAssignment.VAR_ASSIGNMENT;
}
