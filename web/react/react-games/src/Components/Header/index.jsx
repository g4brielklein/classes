import CSLImg from '../../assets/ulbra-csl.jpeg'
import './style.css'

function Header() {
    return (
        <header>
            <div>
                <img
                    src={ CSLImg } 
                    alt="Profile picture" 
                />
            </div>
        </header>
    )
}

export default Header
