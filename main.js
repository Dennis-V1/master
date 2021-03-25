let addToDoButton = document.getElementById('addToDo');
let toDoContainer = document.getElementById('toDoContainer');
let inputField = document.getElementById('inputField');

addToDoButton.addEventListener('click', function(){
    var ul = document.createElement('ul');
    ul.classList.add('ul-styling');
    ul.innerText = inputField.value;
    listeTodos.appendChild(ul);
    inputField.value = "";
    ul.addEventListener('dblclick', function(){
        listeTodos.removeChild(ul);
    })
})

function todoDragEvent(event){
    var toev ="empty";
}
function todoDragEndEvent(event){
    let elemBelow = document.elementFromPoint(event.clientX, event.clientY);
    console.log("elementBelow -->", elemBelow);
    let draggedElement = event.srcElement;
    var id = draggedElement.getAttribute('data-id');
    let todoIndex = app.dodo.findIndex(element => element.id == id);
    elemBelow.closest('todoInArbeit').querySelector("ul");
    elemBelow.closest('todofertigListe').querySelector("ul");
    addTodoListItem(app.dodo[todoIndex], ul) 
    draggedElement.remove();
}

