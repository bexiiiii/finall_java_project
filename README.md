# 🎬 REST API для управления кинотеатрами, фильмами и зрителями

**Базовый URL:** `http://localhost:8080/api/`

## 📌 Оглавление

- [Cinema API](#cinema-api)
- [Movie API](#movie-api)
- [Viewer API](#viewer-api)

---

## 🎬 Cinema API

### ➕ Добавить кинотеатр

**POST** `/cinema/add`

**Описание:** Добавляет новый кинотеатр.

#### 🔹 Тело запроса (JSON):

```json
{
  "name": "Cinema Name",
  "location": "Address"
}
```

#### 🔹 Ответ:

- `200 OK` – "Cinema added successfully!"
- `400 BAD REQUEST` – "Error: сообщение ошибки"

---

### 📜 Получить все кинотеатры

**GET** `/cinema/all`

**Описание:** Возвращает список всех кинотеатров.

#### 🔹 Ответ:

```json
[
  {
    "id": 1,
    "name": "Cinema 1",
    "location": "Address 1"
  }
]
```

---

### 🔍 Получить кинотеатр по ID

**GET** `/cinema?id={id}`

**Описание:** Возвращает кинотеатр по ID.

#### 🔹 Пример запроса:

`GET /cinema?id=1`

#### 🔹 Ответ:

```json
{
  "id": 1,
  "name": "Cinema 1",
  "location": "Address 1"
}
```

- `404 NOT FOUND` – если кинотеатр не найден.

---

### ✏ Обновить кинотеатр

**PUT** `/cinema/update`

**Описание:** Обновляет данные кинотеатра.

#### 🔹 Тело запроса (JSON):

```json
{
  "id": 1,
  "name": "Updated Name",
  "location": "New Address"
}
```

#### 🔹 Ответ:

- `200 OK` – "Cinema updated successfully!"
- `404 NOT FOUND` – "Cinema not found!"

---

### ❌ Удалить кинотеатр

**DELETE** `/cinema?id={id}`

**Описание:** Удаляет кинотеатр по ID.

#### 🔹 Пример запроса:

`DELETE /cinema?id=1`

#### 🔹 Ответ:

- `200 OK` – "Cinema deleted successfully!"
- `404 NOT FOUND` – "Cinema not found!"

---

## 🎥 Movie API

### ➕ Добавить фильм

**POST** `/movie/add`

**Описание:** Добавляет новый фильм.

#### 🔹 Тело запроса (JSON):

```json
{
  "title": "Movie Name",
  "genre": "Action",
  "duration": 120
}
```

#### 🔹 Ответ:

- `200 OK` – "Movie added successfully!"
- `400 BAD REQUEST` – "Error: сообщение ошибки"

---

### 📜 Получить все фильмы

**GET** `/movie/all`

**Описание:** Возвращает список всех фильмов.

#### 🔹 Ответ:

```json
[
  {
    "id": 1,
    "title": "Movie 1",
    "genre": "Action",
    "duration": 120
  }
]
```

---

### 🔍 Получить фильм по ID

**GET** `/movie?id={id}`

**Описание:** Возвращает фильм по ID.

#### 🔹 Пример запроса:

`GET /movie?id=1`

#### 🔹 Ответ:

```json
{
  "id": 1,
  "title": "Movie 1",
  "genre": "Action",
  "duration": 120
}
```

- `404 NOT FOUND` – если фильм не найден.

---

### ✏ Обновить фильм

**PUT** `/movie/update`

**Описание:** Обновляет данные фильма.

#### 🔹 Тело запроса (JSON):

```json
{
  "id": 1,
  "title": "Updated Name",
  "genre": "Comedy",
  "duration": 110
}
```

#### 🔹 Ответ:

- `200 OK` – "Movie updated successfully!"
- `404 NOT FOUND` – "Movie not found!"

---

### ❌ Удалить фильм

**DELETE** `/movie?id={id}`

**Описание:** Удаляет фильм по ID.

#### 🔹 Пример запроса:

`DELETE /movie?id=1`

#### 🔹 Ответ:

- `200 OK` – "Movie deleted successfully!"
- `404 NOT FOUND` – "Movie not found!"

---

## 👤 Viewer API

### ➕ Добавить зрителя

**POST** `/viewer/add`

**Описание:** Добавляет нового зрителя.

#### 🔹 Тело запроса (JSON):

```json
{
  "id": 1,
  "name": "John Doe",
  "age": 25,
}
```

#### 🔹 Ответ:

- `200 OK` – "Viewer added successfully!"
- `400 BAD REQUEST` – "Error: сообщение ошибки"

---

### 📜 Получить всех зрителей

**GET** `/viewer/all`

**Описание:** Возвращает список всех зрителей.

#### 🔹 Ответ:

```json
[
  {
    "id": 1,
    "name": "John Doe",
    "age": 25,
    
  }
]
```

---

### 🔍 Получить зрителя по ID

**GET** `/viewer?id={id}`

**Описание:** Возвращает зрителя по ID.

#### 🔹 Пример запроса:

`GET /viewer?id=1`

#### 🔹 Ответ:

```json
{
  "id": 1,
  "name": "John Doe",
  "age": 25,

}
```

- `404 NOT FOUND` – если зритель не найден.

---

### ❌ Удалить зрителя

**DELETE** `/viewer?id={id}`

**Описание:** Удаляет зрителя по ID.

#### 🔹 Пример запроса:

`DELETE /viewer?id=1`

#### 🔹 Ответ:

- `200 OK` – "Viewer deleted successfully!"
- `404 NOT FOUND` – "Viewer not found!"

---

## ✅ Заключение

📌 **Этот API управляет кинотеатрами, фильмами и зрителями.**
📌 **Используйте JSON в ************************`POST`************************ и ************************`PUT`************************ запросах.**
📌 **Ответы сервера всегда в формате JSON.**

