# Домашнее задание к занятию «1.3. Constraint Layout»
**Выполнила** Прыгара О.С

**Важно**: ознакомьтесь со ссылками на главной странице [репозитория с домашними заданиями](../README.md).

**Важно**: если у вас что-то не получилось, оформите Issue согласно [правилам](../report-requirements.md).

## Как сдавать задачи

1. Откройте ваш проект из предыдущего ДЗ.
1. Сделайте необходимые коммиты.
1. Сделайте push. Убедитесь, что ваш код появился на GitHub.
1. Ссылку на ваш проект отправьте в личном кабинете на сайте [netology.ru](https://netology.ru)
1. Задачи, отмеченные как необязательные, можно не сдавать. Это не повлияет на получение зачёта. В этом ДЗ все задачи обязательные.

## Задача Layout

### Легенда

Доверстайте приложение, чтобы получился следующий вид:

![](pic/layout.png)

Обратите внимание на блок с количеством просмотров. С ним есть небольшая проблема, поскольку он расположен справа. Если количество просмотров вырастет, например, до 500, то есть два варианта:
1. Установить фиксированное расстояние от текста до границы родителя, а саму иконку приклеить к границе текста.
1. Оставить достаточное количество места, чтобы поместилось и 500, и 1К. Тогда на всех карточках положение этого блока будет одинаковым.

Проведите небольшое исследование и посмотрите, каким образом это реализовано во ВКонтакте.

<details>
<summary>Если нет доступа к Vk</summary>

Если у вас нет доступа к ВКонтакте, используйте наши скриншоты:

![](pic/vk.png)

</details>

### Задача

Сделайте разметку в соответствии с легендой. Иконки берите из стандартного набора.

Опубликуйте изменения в вашем проекте на GitHub. Убедитесь, что apk собирается с помощью GitHub Actions.

В качестве результата пришлите ссылку на ваш GitHub-проект в личном кабинете студента на сайте [netology.ru](https://netology.ru).

# Домашнее задание к занятию «2.1. Обработка событий в Android»

**Важно**: ознакомьтесь со ссылками, представленными на главной странице [репозитория с домашними заданиями](../README.md).

**Важно**: если у вас что-то не получилось, оформите Issue согласно [правилам](../report-requirements.md).

## Как сдавать задачи

1. Откройте ваш проект с предыдущего ДЗ.
1. Сделайте необходимые коммиты.
1. Сделайте push. Убедитесь, что ваш код появился на GitHub.
1. Ссылку на ваш проект отправьте в личном кабинете на сайте [netology.ru](https://netology.ru).
1. Задачи, отмеченные как необязательные, можно не сдавать. Это не повлияет на получение зачёта. В этом ДЗ все задачи обязательные.

## Задача Like, Share

### Легенда

Поскольку вы делаете приложение с гораздо бóльшими функциональными возможностями, чем делают лекторы, то придётся дописать часть логики (по отношению к лекции).

Ваше приложение должно выглядеть так:

![](pic/layout.png)

### Задача

1. При клике на like должна меняться не только картинка, но и число рядом с ней: лайкаете — увеличивается на 1, дизлайкаете — уменьшается на 1.
1. При клике на share должно увеличиваться число рядом: 10 раз нажали на share — +10.
1. Если количество лайков, share или просмотров перевалило за 999, должно отображаться 1K и т. д., а не 1 000. Предыдущие функции должны работать: если у поста было 999 лайков и вы нажали like, то должно стать 1К, если убрали лайк, то снова 999.

Обратите внимание:
1. 1.1К отображается по достижении 1 100.
1. После 10К сотни перестают отображаться.
1. После 1M сотни тысяч отображаются в формате 1.3M.
1. Подумайте, можно ли это вынести в какую-то функцию вместо того, чтобы хранить эту логику в `Activity`.

Опубликуйте изменения в вашем проекте на GitHub. Убедитесь, что apk собирается с помощью GitHub Actions и при установке в эмуляторе приложение работает корректно.

В качестве результата пришлите ссылку на ваш GitHub-проект в личном кабинете студента на сайте [netology.ru](https://netology.ru).

## Задача Parent Child

### Легенда

Исследование поведения системы — важная часть работы разработчика.

До этого мы устанавливали `OnClickListener` только на один View.

А если мы установим разные Listener на View, которые пересекаются: на `ConstraintLayout`, который содержит все остальные View, и на кнопку `Like`?

### Задача

1. Установите обработчики `OnClickListener` на `binding.root` и `binding.like`.
1. Поставьте внутрь обработчиков точки останова.
1. Запустите приложение в режиме отладки.
1. Кликните на кнопку Like, на кнопку с тремя точками (на ней пока нет обработчика), на текст, на аватар.
1. Установите обработчик `OnClickListener` на аватар и кликните по нему снова.

В качестве результата пришлите ответы на следующие вопросы в личном кабинете студента на сайте [netology.ru](https://netology.ru):
1. Какой из обработчиков сработал при клике на кнопку Like?
1. Сработал ли обработчик на `binding.root` при клике на кнопку с тремя точками?
1. Сработал ли обработчик на `binding.root` при клике на текст?
1. Сработал ли обработчик на `binding.root` при клике на аватар до установки на avatar собственного обработчика?
1. Сработал ли обработчик на `binding.root` при клике на аватар после установки на avatar собственного обработчика?

Попробуйте выявить закономерность: когда срабатывает обработчик на контейнере, а когда нет.

Если не получается работать с отладчиком или ставить точки останова, добавьте в каждый обработчик по println с разным текстом. Если при нажатии текст будет выводиться в LogCat, то обработчик был вызван. Если текста не будет, значит обработчик вызван не был.

**Важно**: не нужно мержить эти «тесты» в master и заливать на GitHub.

