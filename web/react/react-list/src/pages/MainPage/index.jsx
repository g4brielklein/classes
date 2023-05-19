import { useState, useEffect } from 'react';
import './style.css'
import Card from '../../components/Card'

function MainPage() {
    const [studentName, setStudentName] = useState();

    const [students, setStudents] = useState([]);

    const [user, setUser] = useState({ name: "", img: "" });

    function addStudent() {
        const newStudent = {
            name: studentName,
            time: new Date().toLocaleTimeString("pt-br", {
                hour: "2-digit",
                minute: "2-digit",
                second: "2-digit"
            })
        }

        setStudents(prevStudents => [ newStudent, ...prevStudents ]);
    }

    useEffect(() => {
        fetch('https://randomuser.me/api')
        .then(response => response.json())
        .then(data => {
            setUser({ 
                name: data.results[0].name.first,
                img: data.results[0].picture.large
            })
        })
    },[]);


    return (
        <div>
            <div className="container">

                <header>
                    <h1>Attendance List</h1>
                    <div>
                        <strong>{ user.name }</strong>
                        <img src={ user.img } alt="User profile picture" />
                    </div>
                </header>

                <input 
                    type="text" 
                    placeholder="Type student name"
                    onChange={ e => setStudentName(e.target.value) }
                />

                <button 
                    type="button"
                    onClick={ addStudent }
                >Add</button>

                {
                    students.map( student => 
                        <Card 
                            key={ student.time }
                            name={ student.name } 
                            time={ student.time } 
                        /> 
                    )
                    
                }

            </div>
        </div>
    )
}

export default MainPage
