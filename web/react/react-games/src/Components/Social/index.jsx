import './style.css'

import Link from '../../Components/Link'

function Social() {
    return (
        <section className="social">
            <div>
                <h2>My social accounts</h2>
                <p>Follow-me at the social media's below</p>

                <ul className="social-list">

                    <Link url={"https://www.github.com/your-username"} icon={ "github" } />

                    <Link url={"https://www.linkedin.com/in/your-username"} icon={"linkedin"} />

                    <Link url={"https://www.instagram.com/your-username"} icon={"instagram"} />
                </ul>
                
            </div>
        </section>
    )
}

export default Social
