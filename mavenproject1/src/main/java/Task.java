/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
class Task {
    
    String taskName;
    String deadLine;
    String description; 

    public Task(String taskName, String deadLine, String description) {
        this.taskName = taskName;
        this.deadLine = deadLine;
        this.description = description;
        
        System.out.println(taskName);
    }
    
    
}
