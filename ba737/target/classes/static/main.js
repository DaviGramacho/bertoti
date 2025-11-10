const API_URL = 'http://localhost:8080/pilot'; // ajuste para sua porta e back

window.addEventListener('DOMContentLoaded', listarPilotos);

function listarPilotos() {
    fetch(API_URL)
        .then(r => {
            if (!r.ok) throw new Error('Erro ao buscar pilotos');
            return r.json();
        })
        .then(pilotos => {
            const list = document.getElementById('pilotList');
            list.innerHTML = '';
            pilotos.forEach(pilot => {
                const li = document.createElement('li');
                li.innerHTML =
                    `${pilot.nome} | Licença: ${pilot.licenca} | Horas Voo: ${pilot.horasVoo} ` +
                    `<button onclick="editarPiloto(${pilot.id})">Editar</button>` +
                    `<button onclick="deletarPiloto(${pilot.id})">Deletar</button>`;
                list.appendChild(li);
            });
        })
        .catch(err => alert(err.message));
}

document.getElementById('pilotForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const id = document.getElementById('pilotId').value;
    const nome = document.getElementById('nome').value;
    const licenca = document.getElementById('licenca').value;
    const horasVoo = parseInt(document.getElementById('horasVoo').value, 10);
    const pilot = { nome, licenca, horasVoo };

    let url = API_URL, method = 'POST';
    if (id) { url += `/${id}`; method = 'PUT'; }

    fetch(url, {
        method,
        headers: {'Content-Type':'application/json'},
        body: JSON.stringify(pilot)
    })
        .then(response => {
            if (response.ok) {
                listarPilotos();
                limparForm();
            } else {
                response.text().then(text => alert(text || 'Erro ao cadastrar/editar piloto'));
            }
        })
        .catch(err => alert('Erro: ' + err.message));
});

window.editarPiloto = function(id) {
    fetch(`${API_URL}/${id}`)
        .then(r => {
            if (!r.ok) throw new Error('Erro ao buscar piloto');
            return r.json();
        })
        .then(pilot => {
            document.getElementById('pilotId').value = pilot.id;
            document.getElementById('nome').value = pilot.nome;
            document.getElementById('licenca').value = pilot.licenca;
            document.getElementById('horasVoo').value = pilot.horasVoo;
        })
        .catch(err => alert(err.message));
};

window.deletarPiloto = function(id) {
    fetch(`${API_URL}/${id}`, {method: 'DELETE'})
        .then(response => {
            if (response.ok) {
                listarPilotos();
            } else {
                response.text().then(text => alert(text || 'Erro ao deletar piloto'));
            }
        })
        .catch(err => alert(err.message));
};

function limparForm() {
    document.getElementById('pilotId').value = '';
    document.getElementById('pilotForm').reset();
}
