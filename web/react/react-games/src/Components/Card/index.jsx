function Card( { link, img } ) {
    return (
        <li>
            <a 
                target="_blank"
                href={ link }
            >
               
                <img 
                    src={ img }
                    alt="Dark Souls game image" 
                />
            
            </a>
        </li>
    )
}

export default Card
