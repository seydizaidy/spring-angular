package com.zaidy.exceptions;

public class StudentNotFound extends Exception{
    public StudentNotFound(String student_not_found)
    {
        super(student_not_found);
    }
}
