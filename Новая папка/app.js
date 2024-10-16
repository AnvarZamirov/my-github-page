const btns = document.querySelectorAll('button');
for (let i = 0; i < btns.length; i++) {
    const btn = btns[i];
    btn.addEventListener('click', () => {
        document.body.style.backgroundColor = btn.innerText;
    })
}
