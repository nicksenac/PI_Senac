/* global passwordInput */

const form = document.querySelector("#form");
const nameInput = document.querySelector("#name");
const emailInput = document.querySelector("#email");
const telefoneInput = document.querySelector("#telefone");
const situaçãoSelect = document.querySelector("#situação");

form.addEventListener("submit", (event)=> {
    event.preventDefault();
    
    //Verificar se o nome está vazio
    if (nameInput === ''){
        alert("Por favor, preencha seu nome!");
        return;
    }
    
     if (emailInput === '' || !isEmailValid(emailInput.value)){
        alert("Por favor, preencha o email!");
        return;
    }
    
    if (telefoneInput === '' || ValidarTelefone(telefoneInput.value)){
        alert("Por favor, preencha com o seu telefone (XX)XXXXX-XXXX!");
        return;
    }
    
    if (!validatePassword(passwordInput.value)){
        alert("A senha precisaa ter 8 dígitos!");
        return;
    }
    
    //Verificar se a situação (cliente ou fornecedor) foi criado
    if (situaçãoSelect.value === ""){
        alert("Por favor, selecione como deseja ser cadastrado(a)");
    }
    
    // Se todos os campos estiverem correto
    form.submit();
});

//função para validar o email
function isEmailValid(email){
    
    //criação da regex
    const emailRegex = new RegExp(
       //usuario12@gmail.com
       /^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\.[a-z]{2,}$/
    );
    
    if(emailRegex.test(email)){
        return true;
    }
    
    return false;
}

// função que valida a senha
function validaPassword(password, minDigits){
    if(password,length >= minDigits){
        //senha válida
        return true;
    }
    
    //senha inválida
    return false;
}

//função para validar o telefone
function validarTelefone() {
    var telefone = document.getElementById("telefone").value;
    var regexTelefone = /^\(\d{2}\)\s\d{4,5}-\d{4}$/;
    
    if (regexTelefone.test(telefone)) {
        alert("Número de telefone válido!");
        return true;
    } else {
        alert("Por favor, insira um número de telefone válido no formato (XX) XXXX-XXXX ou (XX) XXXXX-XXXX.");
        return false;
    }
}