document.addEventListener('DOMContentLoaded', () =>{
    console.log('Dom полностью загружен');
    const ajax = document.getElementById('btn');
    const ajax2 = document.getElementById('btn2');
    const ajax3 = document.getElementById('btn3');
    const ajax4 = document.getElementById('btn4');
    const url = 'https://jsonplaceholder.typicode.com/posts/1';
    const url2 = 'https://jsonplaceholder.typicode.com/posts';
    ajax.addEventListener('click', () =>{
        const xhr = new XMLHttpRequest();
        xhr.open('GET', url, true);
        xhr.onreadystatechange = function () {
            if(xhr.readyState === 4 && xhr.status === 200){
                const post = JSON.parse(xhr.responseText); // до сюда одинаково
                console.log(post);
                const p = document.createElement('p');
                p.textContent = post.title;
                document.body.appendChild(p);
            }
        };
        xhr.send();
    });
    // новый способ
    ajax2.addEventListener('click', () =>{
        fetch(url).then(response => {
            if(!response.ok) throw new Error('Ошибка сети');
            return response.json();
        }).then(data => console.log(data))
        .catch(error => console.error(error));
    })

    //асинхронная
    ajax3.addEventListener('click', () =>{
        getPost();
    })
    async function getPost(){
         try{
            const response = await fetch(url);
            if(!response.ok) throw new Error('Ошибка сети');
            const data = await response.json();
            console.log(data);
        }
        catch(error){
            console.error(error);
        }
    }

    ajax4.addEventListener('click', () =>{
        postPost();
    })

    async function postPost(){
        try{
           const response = await fetch(url2, {
               method: 'POST',
               headers: {'Content-type': 'application/json'},
               body: JSON.stringify({tittle: 'Новый пост', body: 'Содержимое', userId: 1})
           });
           if(!response.ok) throw new Error('Ошибка сети');
           const data = await response.json();
           console.log(data);
       }
       catch(error){
           console.error(error);
       }
   }

});