const wrapper = document.querySelector('.wrapper');
const h1 = document.querySelector('h1');
const p = document.querySelector('p');
const a = document.querySelector('a');

const button = document.querySelector('button');

fetch('https://content.guardianapis.com/search?page=4&page-size=5&api-key=23be7ca1-3c45-4363-9d2f-9cc3d423b183')
    .then((res) => res.json())
    .then((data) => {
        data.response.results.forEach((obj) => {
            wrapper.innerHTML += `
            <div class="news-card">
                <h1>${obj.webTitle}</h1>
                <div class="inline">
                    <p>${obj.sectionName}</p>
                    <a target="_blank" href=${obj.webUrl}>Direct Link 🔗</a>
                </div>      
            </div>`
        })
    })
let pageNumber = 5

const searchBtn = document.querySelector('.search-icon')
const searchQuest = document.querySelector('.search')

searchBtn.addEventListener('click', () => {
    console.log(searchQuest.value)
    const questSearch = () => {
        const NEWS_URL = `https://content.guardianapis.com/search?q=${searchQuest.value}&page=${pageNumber}&page-size=5&api-key=23be7ca1-3c45-4363-9d2f-9cc3d423b183`;
        fetch(NEWS_URL)
            .then(res => res.json())
            .then((data) => {
                data.response.results.forEach((obj) => {
                    wrapper.innerHTML += `
            <div class="news-card">
                <h1>${obj.webTitle}</h1>
                <div class="inline">
                    <p>${obj.sectionName}</p>
                    <a target="_blank" href=${obj.webUrl}>Direct Link 🔗</a>
                </div>      
            </div>`
                    // pageNumber++;
                })

            })
            .catch((err) => {
                return err.message;
            })

    }


    questSearch();
    pageNumber++
})

const loadSomeQuestNews = () => {
        const NEWS_URL = `https://content.guardianapis.com/search?q=${searchQuest.value}&page=${pageNumber}&page-size=5&api-key=23be7ca1-3c45-4363-9d2f-9cc3d423b183`;
        fetch(NEWS_URL)
            .then(res => res.json())
            .then((data) => {
                data.response.results.forEach((obj) => {
                    wrapper.innerHTML += `
            <div class="news-card">
                <h1>${obj.webTitle}</h1>
                <div class="inline">
                    <p>${obj.sectionName}</p>
                    <a target="_blank" href=${obj.webUrl}>Direct Link 🔗</a>
                </div>      
            </div>`
                    pageNumber++;
                })
            })
    }

button.addEventListener('click', () => {
    loadSomeQuestNews();
    pageNumber++;
})