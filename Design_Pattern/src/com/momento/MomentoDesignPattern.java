package com.momento;

public class MomentoDesignPattern {
    public static void main(String[] args) {
        FeedbackFrom feedbackForm = new FeedbackFrom("John Doe", "john.doe@example.com", "Great service!");
        FeedbackMomentoCareTaker caretaker = new FeedbackMomentoCareTaker();

        // Saving the initial state
        caretaker.saveState(feedbackForm);

        // Modifying the feedback form
        feedbackForm.setComment("Updated Comment: Good service!");
        System.out.println("Current Feedback: " + feedbackForm.getComment());

        // Restoring to the saved state
        feedbackForm.restore(caretaker.getSavedState());
        System.out.println("Restored Feedback: " + feedbackForm.getComment());
    }
}

class FeedbackFrom {
    private String name;
    private String email;
    private String comment;

    public FeedbackFrom(String name, String email, String comment) {
        this.name = name;
        this.email = email;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Saving the state to Memento
    public FeedBackMomento save() {
        return new FeedBackMomento(name, email, comment);
    }

    // Restoring the state from Memento
    public void restore(FeedBackMomento momento) {
        this.name = momento.getName();
        this.email = momento.getEmail();
        this.comment = momento.getComment();
    }
}

class FeedBackMomento {
    private final String name;
    private final String email;
    private final String comment;

    public FeedBackMomento(String name, String email, String comment) {
        this.name = name;
        this.email = email;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }
}

class FeedbackMomentoCareTaker {
    private FeedBackMomento momento;

    public void saveState(FeedbackFrom form) {
        this.momento = form.save();
    }

    public FeedBackMomento getSavedState() {
        return this.momento;
    }
}
