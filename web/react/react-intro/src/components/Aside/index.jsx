import './style.css'

import LogoCSL from '../../assets/logoCSL.jpeg'

function Aside() {
    return (
        <aside className="left">
            {/* <!-- Image--> */}
            <img src={LogoCSL} width="160px" alt="Colégio Ulbra São Lucas's logo" />
            {/* <!-- List menu --> */}
            <ul>
                <li>
                    <a href="#home" className="active">Home</a>
                </li>
                <li>
                    <a href="#carrer">Carrer</a>
                </li>
                <li>
                    <a href="#contact">Contact</a>
                </li>
                <li>
                    <a href="#about">About</a>
                </li>
            </ul>
        </aside>
    )
}

export default Aside
