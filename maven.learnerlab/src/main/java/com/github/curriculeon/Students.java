package com.github.curriculeon;

/**
 * Created by leon on 1/13/2020.
 */
public final class Students extends People<Student> {
    private static Students INSTANCE;

    private Students() {
        super();
        String[] studentNames = {"Divya", "Nez", "James"};
        for (Integer id = 0; id < studentNames.length; id++) {
            String studentName = studentNames[id];
            Student student = new Student(id.longValue(), studentName);
            super.add(student);
        }
    }

    @Override
    public Student[] toArray() {
        return super.personList.toArray(new Student[0]);
    }

    public static Students getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Students();
        }
        return INSTANCE;
    }
}
