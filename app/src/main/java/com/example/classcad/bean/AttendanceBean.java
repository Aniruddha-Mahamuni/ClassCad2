package com.example.classcad.bean;


public class AttendanceBean {

    public int attendance_session_id;
    public int attendance_student_id;
    public String attendance_status;

    public int getAttendance_session_id() {
        return attendance_session_id;
    }
    public void setAttendance_session_id(int attendance_session_id) {
        this.attendance_session_id = attendance_session_id;
    }
    public int getAttendance_student_id() {
        return attendance_student_id;
    }
    public void setAttendance_student_id(int attendance_student_id) {
        this.attendance_student_id = attendance_student_id;
    }
    public String getAttendance_status() {
        return attendance_status;
    }
    public void setAttendance_status(String attendance_status) {
        this.attendance_status = attendance_status;
    }



}
