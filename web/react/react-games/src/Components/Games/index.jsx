import './style.css'

import Card from '../Card'
import DSImg from '../../assets/dark-souls.png'
import REImg from '../../assets/resident-evil.webp'
import GOWImg from '../../assets/god-of-war.webp'


function Games() {
    return (
        <section className="games">
            <div>
                <h2>My Games</h2>
                <p>My favorite games</p>

                <ul className="games-list">

                    <Card link={ "https://www.twitch.tv/directory/game/Dark%20Souls" } img={ DSImg } />

                    <Card link={ "https://www.twitch.tv/directory/game/Resident%20Evil" } img={ REImg } />

                    <Card link={ "https://www.twitch.tv/directory/game/God%20of%20War" } img={ GOWImg } />

                </ul>
                
            </div>
        </section>
    )
}

export default Games
