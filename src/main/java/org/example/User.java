package org.example;







public class User {

    private String date;
    private String category;
    private String title;
    private Double  amount;


    @Override
    public String toString() {
        return "User{" +
                "date='" + date + '\'' +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public Double getAmount() {
        return amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public User(String date, String category, String title,Double amount) {
        this.date = date;
        this.category = category;
        this.title = title;
        this.amount = amount;
    }
}
