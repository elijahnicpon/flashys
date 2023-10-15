export default function Navbar() {
    const path = window.location.pathname
    return (
        <div className="customlinkcontainer">
            <nav className="nav">
                <ul>
                    <CustomLink href="/flashes">Flashes</CustomLink>
                    <CustomLink href="/artists">Artists</CustomLink>   
                </ul>
            </nav>
        </div>
)}

function CustomLink({ href, children, ...props}) {
    const path = window.location.pathname
    return (
        <li className={path === href ? "active" : ""}>
            <a href={href} {...props}>{children}</a>
        </li>
    )
}