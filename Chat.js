// Function to add a new to-do item
function addTodo() {
    var inputField = document.getElementById("todoInput");
    var todoText = inputField.value.trim();

    if (todoText !== "") {
        // Create a new list item
        var listItem = document.createElement("li");

        // Create a checkbox
        var checkbox = document.createElement("input");
        checkbox.type = 
		"checkbox";
        checkbox.addEventListener("change", toggleTodo);

        // Create a text node with the to-do item text
        var todoTextNode = document.createTextNode(todoText);

        // Append the checkbox and text to the list item
        listItem.appendChild(checkbox);
        listItem.appendChild(todoTextNode);

        // Append the list item to the to-do list
        document.getElementById('todoList').appendChild(listItem);

        // Clear the input field
        inputField.value = '';
    }
}
// Function to toggle the completed status of a to-do item
function toggleTodo() {
    var listItem = this.parentNode;
    if (this.checked) {
        listItem.style.textDecoration = "line-through";
		listItem.style.color = "red";
    } else {
        listItem.style.textDecoration = "none";
    }
}