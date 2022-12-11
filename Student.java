package com.hccs.advweb;

public class Student { 
int id; 
String name; 
double gpa; 
String email; 
String gender; 
public int getId() { 
return id; 
} 
public void setId(int id) { 
this.id = id; 
} 
public String getName() { 
return name; 
} 
public void setName(String name) { 
this.name = name; 
} 
public double getGpa() { 
return gpa; 
} 
public void setGpa(double gpa) { 
this.gpa = gpa; 
} 
public String getEmail() { 
return email; 
} 
public void setEmail(String email) { 
this.email = email; 
} 
public String getGender() { 
return gender; 
} 
public void setGender(String gender) { 
this.gender = gender; 
} 
public Student(int id, String name, double gpa, String email, String gender) { 
super(); 
this.id = id; 
this.name = name; 
this.gpa = gpa; 
this.email = email; 
this.gender = gender; 
} 
} 