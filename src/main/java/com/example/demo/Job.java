package com.example.demo;

/*
Company
Create a good app for me to register the players name, age, height and position. With a good background
*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//public class Job {

     @Entity
    public class Job {
         @Id
         @GeneratedValue(strategy = GenerationType.AUTO)
         private long id;

         @NotNull
         @Size(min = 1)
         private String name;

         @NotNull
         @Size(min = 0)
         private String age;

         @NotNull
         @Size(min = 0)
         private String height;

         @NotNull
         @Size(min = 2)
         private String position;


         public long getId() {
             return id;
         }

         public void setId(long id) {
             this.id = id;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public String getAge() {
             return age;
         }

         public void setAge(String age) {
             this.age = age;
         }

         public String getHeight() {
             return height;
         }

         public void setHeight(String height) {
             this.height = height;
         }

         public String getPosition() {
             return position;
         }

         public void setPosition(String position) {
             this.position = position;
         }
     }















