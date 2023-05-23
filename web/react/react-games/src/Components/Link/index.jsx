function Link({ url, icon }) {
    const innerIcon = `fa-brands fa-${icon} fa-2xl`

    return (
        <li>
            <a 
                target="_blank"
                href={ url }
            >
                <i 
                    className={ innerIcon }
                    style={{ color: "#000000" }}
                ></i>
            </a>
        </li>
    )
}

export default Link
