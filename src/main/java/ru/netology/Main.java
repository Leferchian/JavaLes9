package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Иванов";
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.passport = "9999№999999";
        post.phone = "+7 915 387 15 82";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 3;
        post.birthday.year = 1993;
    }
}
