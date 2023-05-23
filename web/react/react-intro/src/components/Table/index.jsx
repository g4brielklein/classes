import './style.css'

function Table() {
    return (
        <> 
            <h2>How can I help you?</h2>

            <table>
                <thead>
                    <tr>
                        <th>HTML</th>
                        <th>CSS</th>
                        <th>JavaScript</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <i className="fa-brands fa-html5" style={{color: "#fa7000"}}></i>
                        </td>
                        <td>
                            <i className="fa-brands fa-css3-alt" style={{color: "#025cf7"}}></i>
                        </td>
                        <td>
                            <i className="fa-brands fa-js" style={{color: "#b2b51c"}}></i>
                        </td>
                    </tr>
                    <tr>
                        <td>Building your website</td>
                        <td>Designing your website</td>
                        <td>Building awesome features</td>
                    </tr>
                </tbody>
            </table>
        </>
    )
}

export default Table
