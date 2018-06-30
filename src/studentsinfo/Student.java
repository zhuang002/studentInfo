/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsinfo;

/**
 *
 * @author huang
 */
class Student {

    int id;
    String name;
    int age;
    char gender;
    String school;
    String program;
    String nationality;

    void printInfo() {
        System.out.println("id:"+this.id);
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("gender:"+this.gender);
        System.out.println("school:"+this.school);
        System.out.println("program:"+this.program);
        System.out.println("nationality:"+this.nationality);
    }
    
}
