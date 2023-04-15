const tableContainer = document.getElementById('table-container');
const table = document.createElement('table');

for (let i = 1; i <= 9; i++) {
    const row = document.createElement('tr');
    for (let j = 1; j <= 9; j++) {
        const cell = document.createElement('td');
        const text = document.createTextNode(i + "*" + j + "=" + (i * j));
        cell.appendChild(text);
        row.appendChild(cell);
    }
    table.appendChild(row);
}

tableContainer.appendChild(table);
