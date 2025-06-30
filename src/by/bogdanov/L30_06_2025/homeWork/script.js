document.addEventListener('DOMContentLoaded', () =>{
    console.log('Dom полностью загружен');

    const loadPhotosBtn = document.getElementById('loadPhotosBtn');
    const gallery = document.getElementById('gallery');
    const url = 'https://jsonplaceholder.typicode.com/photos?_limit=10';
    loadPhotosBtn.addEventListener('click', () =>{
        getPost();
    })

    async function getPost(){
        try{
           const response = await fetch(url);
           if(!response.ok) throw new Error('Ошибка сети');
           const data = await response.json();
           console.log(data);
           for (const card of data) {
            const div = document.createElement('div');
            div.setAttribute('class', 'photo-card');
            const img = document.createElement('img');
            img.setAttribute('src', card.thumbnailUrl);
            const p = document.createElement('p');
            p.textContent = card.title;
            div.appendChild(img);
            div.appendChild(p);
            gallery.appendChild(div);
           }

       }
       catch(error){
           console.error(error);
       }
   }

})