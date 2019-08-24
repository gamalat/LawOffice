package model;

import java.util.Date;

public class IssueClass {

   String issues_num;
    String name;
    String type;
    String date_of_judgment;
    String description;
    String report;
    String lawyer_id;
    String comment;
    String status;

    public IssueClass() {
    }

    public IssueClass(String issues_num, String name, String type, String date_of_judgment, String description, String report, String lawyer_id, String comment, String status) {
        this.issues_num = issues_num;
        this.name = name;
        this.type = type;
        this.date_of_judgment = date_of_judgment;
        this.description = description;
        this.report = report;
        this.lawyer_id = lawyer_id;
        this.comment = comment;
        this.status = status;
    }

    public String getIssues_num() {
        return issues_num;
    }

    public void setIssues_num(String issues_num) {
        this.issues_num = issues_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_of_judgment() {
        return date_of_judgment;
    }

    public void setDate_of_judgment(String date_of_judgment) {
        this.date_of_judgment = date_of_judgment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getLawyer_id() {
        return lawyer_id;
    }

    public void setLawyer_id(String lawyer_id) {
        this.lawyer_id = lawyer_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

}