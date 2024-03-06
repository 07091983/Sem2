package org.example;

import org.example.Subscriber.Subscriber;
import org.example.Subscriber.YandexSub_1;
import org.example.Subscriber.YandexSub_2;
import org.example.provider.NewGrodno;
import org.example.provider.Newspaper;
import org.example.provider.Yandex;

public class Main {
    public static void main(String[] args) {
        Newspaper newspaper = new Yandex();
        Subscriber Yandex1 = new YandexSub_1("Anna");
        Subscriber Yandex2 = new YandexSub_2("Vasia");
        newspaper.subscription(Yandex1);
        newspaper.subscription(Yandex2);
        newspaper.notification("Пришла весна!!!");
        newspaper.unsubscribe(Yandex2);
        newspaper.notification("Скоро выходные");
        Newspaper grodno = new NewGrodno();
        grodno.subscription(Yandex1);
        grodno.subscription(Yandex2);
        grodno.notification("Зфвтра будет солнечно");
        newspaper.notification("Ушла весна");
    }
}