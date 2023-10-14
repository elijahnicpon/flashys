export default function Navbar() {
    const path = window.location.pathname
    return (
        <nav className="nav">
            <a href="/" className="site-title">Site Name</a>
            <ul>
                <CustomLink href="/flashes">Flashes</CustomLink>
                <CustomLink href="/artists">Artists</CustomLink>
            </ul>
        </nav>
)}

function CustomLink({ href, children, ...props}) {
    const path = window.location.pathname
    return (
        <li cla
        ssName={path === href ? "active" : ""}>
            <a href={href} {...props}>{children}</a>
        </li>
    )
}