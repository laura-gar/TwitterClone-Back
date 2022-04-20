# Let's convert some values!

This is a repository that includes all the backend code for the AREP-Twitter project, built with Java (using Spark framework) and Maven as a dependency manager.

### API

---

**Base URL**

```url
https://ec2-54-163-27-162.compute-1.amazonaws.com:4567/api/v1
```

### ENDPOINTS

---

For converting getting the last 20 tweets, you must use this endpoint:

```url
/feed
```

For converting posting a new tweet, you must use this endpoint:

```url
/post
```

### REQUESTS

---

- For getting the last 20 tweets of the feed:

```url
/feed
```

- For posting a new tweet to the feed:

```url
/post
```
```json
{
  "avatar": "",
  "displayName": "",
  "image": "",
  "text": "",
  "username": "",
  "verified": 0
}
```
Where:

- **avatar:** The URL of the profile image of the user
- **displayName:** The name that should be shown from the user.
- **image (optional)**: The URL of the image tweeted.
- **text**: The tweet itself.
- **username**: The username of the user that posted the tweet.
- **verified**: 1 if the user is verified and 0 otherwise (this will display the blue check next to the _displayName_ on each tweet from the user).


### RESPONSES

---

When we do a **GET** to the _/feed_ endpoint:

```json
[{
  "avatar": "",
  "displayName": "",
  "image": "",
  "text": "",
  "username": "",
  "verified": 0
}]
```
Where:

- **avatar:** The URL of the profile image of the user
- **displayName:** The name that should be shown from the user.
- **image (optional)**: The URL of the image tweeted.
- **text**: The tweet itself.
- **username**: The username of the user that posted the tweet.
- **verified**: 1 if the user is verified and 0 otherwise (this will display the blue check next to the _displayName_ on each tweet from the user).

### LINKS

---

**Backend**

```url
https://ec2-54-163-27-162.compute-1.amazonaws.com:4567/api/v1
```


## Run the project locally!

- Download or clone the project, go to the _Backend_ directory and run:

```url
mvn package
```

Then, go to **App.java** and run the **main()** method.


## Built With
- [Spark](https://sparkjava.com/) - As the Java framework for the backend.

## Authors

- **Laura Valentina García León** - [Github](https://github.com/laura-gar)<br/>
  Student at: [Escuela Colombiana de Ingeniería Julio Garavito](https://www.escuelaing.edu.co/es/) <br/>
  2022
- **Juan David Murillo** - [Github](https://github.com/juancho20sp) | [Twitter](https://twitter.com/juancho20sp)<br/>
  Student at: [Escuela Colombiana de Ingeniería Julio Garavito](https://www.escuelaing.edu.co/es/) <br/>
  2022

## License

This is an _open source_ project.

### Thanks for checking out!
