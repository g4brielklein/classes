import './style.css'

function Header() {
    return (
        <header className="header">
            <h1>Colégio Ulbra São Lucas</h1>
            <div className="social">
                <a href="http://linkedin.com/your-username" target="_blank">
                    <i className="fa-brands fa-linkedin" style={{color: "#1f3251"}} />
                </a>

                <a href="https://github.com/your-username" target="_blank">
                    <i className="fa-brands fa-github" style={{color: "#000000"}} />
                </a>
            </div>
        </header>
    )
}

export default Header
