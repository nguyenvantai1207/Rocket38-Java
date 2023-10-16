package com.vti.entity;

public class Answer {
    private static int countAnswer = 1;
    private int id;
    private String content;
    private Question questionId;
    Boolean isCorrect;

    public Answer(String content, Question questionId, Boolean isCorrect) {
        this.id = countAnswer++;
        this.content = content;
        this.questionId = questionId;
        this.isCorrect = isCorrect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }
}
