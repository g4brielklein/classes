import { useState, useEffect } from 'react';
import './style.css'
import Card from '../../componentes/Card'
import LogoCSL from '../../assets/ulbra-csl.jpeg'

function PaginaInicial() {
    const [nomeAluno, setNomeAluno] = useState("Digite o nome...");

    const [alunos, setAlunos] = useState([]);

    const [usuario, setUsuario] = useState({ nome: "", img: "" });

    function adicionarAluno() {
        const novoAluno = {
            nome: nomeAluno,
            hora: new Date().toLocaleTimeString("pt-br", {
                hour: "2-digit",
                minute: "2-digit",
                second: "2-digit"
            })
        }

        setAlunos(alunosAnteriores => [ novoAluno, ...alunosAnteriores ]);
    }

    useEffect(() => {
        // corpo do useEffect
        fetch('https://randomuser.me/api')
        .then(response => response.json())
        .then(data => {
            setUsuario({ 
                nome: data.results[0].name.first,
                img: data.results[0].picture.large
            })
        })
    },[]);


    return (
        <div>
            <div className="container">

                <header>
                    <h1>Lista de Presença</h1>
                    <div>
                        <strong>{ usuario.nome }</strong>
                        <img src={ usuario.img } alt="Logo do CSL" />
                    </div>
                </header>

                <input 
                    type="text" 
                    placeholder="Digite o nome"
                    onChange={ e => setNomeAluno(e.target.value) }
                />

                <button 
                    type="button"
                    onClick={ adicionarAluno }
                >Adicionar</button>

                {
                    alunos.map( aluno => 
                        <Card 
                            key={ aluno.hora }
                            nome={ aluno.nome } 
                            hora={ aluno.hora } 
                        /> 
                    )
                    
                }

            </div>

            <footer className="footer">
                Feito por *Seu Nome Aqui*
            </footer>
        </div>
    )
}

export default PaginaInicial
