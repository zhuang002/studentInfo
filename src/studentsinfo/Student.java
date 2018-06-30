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

    void deserialize(String sStudent) {
        String[] fields=sStudent.split("&");
       this.id=Integer.parseInt(fields[0]);
       this.name = fields[1];
       this.age = Integer.parseInt(fields[2]);
       this.gender = fields[3].charAt(0);
       this.school= fields[4];
       this.program = fields[5];
       this.nationality = fields[6];
    }
    
    String serialize() {
        String sRet=
            this.id+"&"+this.name+"&"+this.age+"&"+this.gender+"&"+this.school+"&"+this.program+"&"+this.nationality;
        return sRet;
    }
    
}
