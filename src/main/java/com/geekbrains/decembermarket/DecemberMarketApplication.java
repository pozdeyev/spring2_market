package com.geekbrains.decembermarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecemberMarketApplication {

	// 1. История заказов (done)
	// 2. Добавить регистрацию с валидацией (done)
	// 3. Покупка в 1 клик без регистрации по номеру телефона (done)
	// 4. Автоподвязывание по номеру телефона истории заказов (если человек на номер 123
	// в виде гостя оформил 20 заказов, и потом зарегался под этим номером, то под его
	// новую учетную запись должны подвязаться все эти заказы) (done, автоматическая регистрация при быстром заказе,
	// использовать уже зарегистрированный номер нельзя)
	// 5. Если пользователь купил товар, то он должен иметь возможность оставить отзыв
	// о товаре, и выставить оценку (done)
	// 11. История просмотров товара (куки) (done)
	//SOAP (done)

	// 1. После оформления заказа в корзине, пользователю необходимо показать
	// отдельную страницу с ифнормацией о заказе (done)
	// 2. На этой же странице (из п.1) пользовательн должен указать: адрес
	// доставки, контактный телефон (по-умалочанию показываем телефон (done)
	// пользователя)
	// 3. Только после подтверждения на страницу из п.1 заказ должен быть
	// сохранен в базе данных (done)

	// 9. Картинки для товаров //done
	// 1. Добавить платежную систему (PayPal) //done
	// Работа с почтой, подтверждение покупки, авторизация пользователя //done




	public static void main(String[] args) {
		SpringApplication.run(DecemberMarketApplication.class, args);
	}
}
