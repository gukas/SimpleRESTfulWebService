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
import db.generated.tables.records.AbroadRecord;
import db.generated.tables.records.AssignmentRecord;
import db.generated.tables.records.EnterpriseRecord;
import db.generated.tables.records.GroupStRecord;
import db.generated.tables.records.LecturerRecord;
import db.generated.tables.records.PaymentRecord;
import db.generated.tables.records.ProfessionRecord;
import db.generated.tables.records.RelativeRecord;
import db.generated.tables.records.RepresentativeRecord;
import db.generated.tables.records.StudentRecord;
import db.generated.tables.records.SubFacultyRecord;
import db.generated.tables.records.VarAssignmentRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>college</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AbroadRecord> KEY_ABROAD_PRIMARY = UniqueKeys0.KEY_ABROAD_PRIMARY;
    public static final UniqueKey<AssignmentRecord> KEY_ASSIGNMENT_PRIMARY = UniqueKeys0.KEY_ASSIGNMENT_PRIMARY;
    public static final UniqueKey<EnterpriseRecord> KEY_ENTERPRISE_PRIMARY = UniqueKeys0.KEY_ENTERPRISE_PRIMARY;
    public static final UniqueKey<EnterpriseRecord> KEY_ENTERPRISE_NAME = UniqueKeys0.KEY_ENTERPRISE_NAME;
    public static final UniqueKey<GroupStRecord> KEY_GROUP_ST_PRIMARY = UniqueKeys0.KEY_GROUP_ST_PRIMARY;
    public static final UniqueKey<GroupStRecord> KEY_GROUP_ST_NOMER = UniqueKeys0.KEY_GROUP_ST_NOMER;
    public static final UniqueKey<LecturerRecord> KEY_LECTURER_PRIMARY = UniqueKeys0.KEY_LECTURER_PRIMARY;
    public static final UniqueKey<PaymentRecord> KEY_PAYMENT_PRIMARY = UniqueKeys0.KEY_PAYMENT_PRIMARY;
    public static final UniqueKey<ProfessionRecord> KEY_PROFESSION_PRIMARY = UniqueKeys0.KEY_PROFESSION_PRIMARY;
    public static final UniqueKey<ProfessionRecord> KEY_PROFESSION_NOMER = UniqueKeys0.KEY_PROFESSION_NOMER;
    public static final UniqueKey<RelativeRecord> KEY_RELATIVE_PRIMARY = UniqueKeys0.KEY_RELATIVE_PRIMARY;
    public static final UniqueKey<RepresentativeRecord> KEY_REPRESENTATIVE_PRIMARY = UniqueKeys0.KEY_REPRESENTATIVE_PRIMARY;
    public static final UniqueKey<StudentRecord> KEY_STUDENT_PRIMARY = UniqueKeys0.KEY_STUDENT_PRIMARY;
    public static final UniqueKey<SubFacultyRecord> KEY_SUB_FACULTY_PRIMARY = UniqueKeys0.KEY_SUB_FACULTY_PRIMARY;
    public static final UniqueKey<SubFacultyRecord> KEY_SUB_FACULTY_NAME = UniqueKeys0.KEY_SUB_FACULTY_NAME;
    public static final UniqueKey<VarAssignmentRecord> KEY_VAR_ASSIGNMENT_PRIMARY = UniqueKeys0.KEY_VAR_ASSIGNMENT_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AbroadRecord, RelativeRecord> ABROAD_IBFK_1 = ForeignKeys0.ABROAD_IBFK_1;
    public static final ForeignKey<AssignmentRecord, VarAssignmentRecord> ASSIGNMENT_IBFK_1 = ForeignKeys0.ASSIGNMENT_IBFK_1;
    public static final ForeignKey<GroupStRecord, SubFacultyRecord> GROUP_ST_IBFK_1 = ForeignKeys0.GROUP_ST_IBFK_1;
    public static final ForeignKey<LecturerRecord, SubFacultyRecord> LECTURER_IBFK_1 = ForeignKeys0.LECTURER_IBFK_1;
    public static final ForeignKey<PaymentRecord, AssignmentRecord> PAYMENT_IBFK_1 = ForeignKeys0.PAYMENT_IBFK_1;
    public static final ForeignKey<ProfessionRecord, SubFacultyRecord> PROFESSION_IBFK_1 = ForeignKeys0.PROFESSION_IBFK_1;
    public static final ForeignKey<RelativeRecord, StudentRecord> RELATIVE_IBFK_1 = ForeignKeys0.RELATIVE_IBFK_1;
    public static final ForeignKey<RepresentativeRecord, EnterpriseRecord> REPRESENTATIVE_IBFK_1 = ForeignKeys0.REPRESENTATIVE_IBFK_1;
    public static final ForeignKey<StudentRecord, GroupStRecord> STUDENT_IBFK_1 = ForeignKeys0.STUDENT_IBFK_1;
    public static final ForeignKey<VarAssignmentRecord, StudentRecord> VAR_ASSIGNMENT_IBFK_1 = ForeignKeys0.VAR_ASSIGNMENT_IBFK_1;
    public static final ForeignKey<VarAssignmentRecord, RepresentativeRecord> VAR_ASSIGNMENT_IBFK_2 = ForeignKeys0.VAR_ASSIGNMENT_IBFK_2;
    public static final ForeignKey<VarAssignmentRecord, LecturerRecord> VAR_ASSIGNMENT_IBFK_3 = ForeignKeys0.VAR_ASSIGNMENT_IBFK_3;
    public static final ForeignKey<VarAssignmentRecord, EnterpriseRecord> VAR_ASSIGNMENT_IBFK_4 = ForeignKeys0.VAR_ASSIGNMENT_IBFK_4;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AbroadRecord> KEY_ABROAD_PRIMARY = createUniqueKey(Abroad.ABROAD, "KEY_abroad_PRIMARY", Abroad.ABROAD.ID);
        public static final UniqueKey<AssignmentRecord> KEY_ASSIGNMENT_PRIMARY = createUniqueKey(Assignment.ASSIGNMENT, "KEY_assignment_PRIMARY", Assignment.ASSIGNMENT.ID);
        public static final UniqueKey<EnterpriseRecord> KEY_ENTERPRISE_PRIMARY = createUniqueKey(Enterprise.ENTERPRISE, "KEY_enterprise_PRIMARY", Enterprise.ENTERPRISE.ID);
        public static final UniqueKey<EnterpriseRecord> KEY_ENTERPRISE_NAME = createUniqueKey(Enterprise.ENTERPRISE, "KEY_enterprise_name", Enterprise.ENTERPRISE.NAME, Enterprise.ENTERPRISE.ADDRESS);
        public static final UniqueKey<GroupStRecord> KEY_GROUP_ST_PRIMARY = createUniqueKey(GroupSt.GROUP_ST, "KEY_group_st_PRIMARY", GroupSt.GROUP_ST.ID);
        public static final UniqueKey<GroupStRecord> KEY_GROUP_ST_NOMER = createUniqueKey(GroupSt.GROUP_ST, "KEY_group_st_nomer", GroupSt.GROUP_ST.NOMER);
        public static final UniqueKey<LecturerRecord> KEY_LECTURER_PRIMARY = createUniqueKey(Lecturer.LECTURER, "KEY_lecturer_PRIMARY", Lecturer.LECTURER.ID);
        public static final UniqueKey<PaymentRecord> KEY_PAYMENT_PRIMARY = createUniqueKey(Payment.PAYMENT, "KEY_payment_PRIMARY", Payment.PAYMENT.ID);
        public static final UniqueKey<ProfessionRecord> KEY_PROFESSION_PRIMARY = createUniqueKey(Profession.PROFESSION, "KEY_profession_PRIMARY", Profession.PROFESSION.ID);
        public static final UniqueKey<ProfessionRecord> KEY_PROFESSION_NOMER = createUniqueKey(Profession.PROFESSION, "KEY_profession_nomer", Profession.PROFESSION.NOMER, Profession.PROFESSION.NAME, Profession.PROFESSION.SUB_FAC_ID);
        public static final UniqueKey<RelativeRecord> KEY_RELATIVE_PRIMARY = createUniqueKey(Relative.RELATIVE, "KEY_relative_PRIMARY", Relative.RELATIVE.ID);
        public static final UniqueKey<RepresentativeRecord> KEY_REPRESENTATIVE_PRIMARY = createUniqueKey(Representative.REPRESENTATIVE, "KEY_representative_PRIMARY", Representative.REPRESENTATIVE.ID);
        public static final UniqueKey<StudentRecord> KEY_STUDENT_PRIMARY = createUniqueKey(Student.STUDENT, "KEY_student_PRIMARY", Student.STUDENT.ID);
        public static final UniqueKey<SubFacultyRecord> KEY_SUB_FACULTY_PRIMARY = createUniqueKey(SubFaculty.SUB_FACULTY, "KEY_sub_faculty_PRIMARY", SubFaculty.SUB_FACULTY.ID);
        public static final UniqueKey<SubFacultyRecord> KEY_SUB_FACULTY_NAME = createUniqueKey(SubFaculty.SUB_FACULTY, "KEY_sub_faculty_name", SubFaculty.SUB_FACULTY.NAME);
        public static final UniqueKey<VarAssignmentRecord> KEY_VAR_ASSIGNMENT_PRIMARY = createUniqueKey(VarAssignment.VAR_ASSIGNMENT, "KEY_var_assignment_PRIMARY", VarAssignment.VAR_ASSIGNMENT.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AbroadRecord, RelativeRecord> ABROAD_IBFK_1 = createForeignKey(db.generated.Keys.KEY_RELATIVE_PRIMARY, Abroad.ABROAD, "abroad_ibfk_1", Abroad.ABROAD.REL_ID);
        public static final ForeignKey<AssignmentRecord, VarAssignmentRecord> ASSIGNMENT_IBFK_1 = createForeignKey(db.generated.Keys.KEY_VAR_ASSIGNMENT_PRIMARY, Assignment.ASSIGNMENT, "assignment_ibfk_1", Assignment.ASSIGNMENT.VAR_ASSIG_ID);
        public static final ForeignKey<GroupStRecord, SubFacultyRecord> GROUP_ST_IBFK_1 = createForeignKey(db.generated.Keys.KEY_SUB_FACULTY_PRIMARY, GroupSt.GROUP_ST, "group_st_ibfk_1", GroupSt.GROUP_ST.SUB_FAC_ID);
        public static final ForeignKey<LecturerRecord, SubFacultyRecord> LECTURER_IBFK_1 = createForeignKey(db.generated.Keys.KEY_SUB_FACULTY_PRIMARY, Lecturer.LECTURER, "lecturer_ibfk_1", Lecturer.LECTURER.SUB_FAC_ID);
        public static final ForeignKey<PaymentRecord, AssignmentRecord> PAYMENT_IBFK_1 = createForeignKey(db.generated.Keys.KEY_ASSIGNMENT_PRIMARY, Payment.PAYMENT, "payment_ibfk_1", Payment.PAYMENT.ASSIG_ID);
        public static final ForeignKey<ProfessionRecord, SubFacultyRecord> PROFESSION_IBFK_1 = createForeignKey(db.generated.Keys.KEY_SUB_FACULTY_PRIMARY, Profession.PROFESSION, "profession_ibfk_1", Profession.PROFESSION.SUB_FAC_ID);
        public static final ForeignKey<RelativeRecord, StudentRecord> RELATIVE_IBFK_1 = createForeignKey(db.generated.Keys.KEY_STUDENT_PRIMARY, Relative.RELATIVE, "relative_ibfk_1", Relative.RELATIVE.STUD_ID);
        public static final ForeignKey<RepresentativeRecord, EnterpriseRecord> REPRESENTATIVE_IBFK_1 = createForeignKey(db.generated.Keys.KEY_ENTERPRISE_PRIMARY, Representative.REPRESENTATIVE, "representative_ibfk_1", Representative.REPRESENTATIVE.ENT_ID);
        public static final ForeignKey<StudentRecord, GroupStRecord> STUDENT_IBFK_1 = createForeignKey(db.generated.Keys.KEY_GROUP_ST_PRIMARY, Student.STUDENT, "student_ibfk_1", Student.STUDENT.GROUP_ID);
        public static final ForeignKey<VarAssignmentRecord, StudentRecord> VAR_ASSIGNMENT_IBFK_1 = createForeignKey(db.generated.Keys.KEY_STUDENT_PRIMARY, VarAssignment.VAR_ASSIGNMENT, "var_assignment_ibfk_1", VarAssignment.VAR_ASSIGNMENT.STUD_ID);
        public static final ForeignKey<VarAssignmentRecord, RepresentativeRecord> VAR_ASSIGNMENT_IBFK_2 = createForeignKey(db.generated.Keys.KEY_REPRESENTATIVE_PRIMARY, VarAssignment.VAR_ASSIGNMENT, "var_assignment_ibfk_2", VarAssignment.VAR_ASSIGNMENT.REPRES_ID);
        public static final ForeignKey<VarAssignmentRecord, LecturerRecord> VAR_ASSIGNMENT_IBFK_3 = createForeignKey(db.generated.Keys.KEY_LECTURER_PRIMARY, VarAssignment.VAR_ASSIGNMENT, "var_assignment_ibfk_3", VarAssignment.VAR_ASSIGNMENT.LECT_ID);
        public static final ForeignKey<VarAssignmentRecord, EnterpriseRecord> VAR_ASSIGNMENT_IBFK_4 = createForeignKey(db.generated.Keys.KEY_ENTERPRISE_PRIMARY, VarAssignment.VAR_ASSIGNMENT, "var_assignment_ibfk_4", VarAssignment.VAR_ASSIGNMENT.ENT_ID);
    }
}
