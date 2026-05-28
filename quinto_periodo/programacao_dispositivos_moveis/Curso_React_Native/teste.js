fetch('http://jsonplaceholder.typicode.com/posts/1')
.then((response) => response.json())
.then((data) => console.log(data))
.catch((err) => console.error("Erro", err))
