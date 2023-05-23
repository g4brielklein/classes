import './style.css'

function Form() {
    return (
        <form>
            <label>Email:</label><br />
            <input type="text" name="email" placeholder="Type here your email" /><br />

            <label>Phone:</label><br />
            <input type="text" name="phone" placeholder="(51) 9____-____" /><br />

            <label>Message:</label><br />
            <textarea name="message" cols="30" rows="5" placeholder="Type here your message..."></textarea><br />

            <input type="button" value="Send" />
        </form>
    )
}

export default Form
