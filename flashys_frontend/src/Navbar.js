import { Link, useMatch, useResolvedPath } from 'react-router-dom'

export default function Navbar() {
    const path = window.location.pathname
    return (
        <div className="customlinkcontainer">
            <nav className="nav">
                <ul>
                    <CustomLink to="/flashes">Flashes</CustomLink>
                    <CustomLink to="/artists">Artists</CustomLink>   
                </ul>
            </nav>
        </div>
)}

function CustomLink({ to, children, ...props}) {
    const resolvedPath = useResolvedPath(to)
    //take out end: true if we want stuff like /flashes/flashes_popup potentially?
    const isActive = useMatch({ path: resolvedPath.pathname, end: true })
    return (
        <li className={resolvedPath === to ? "active" : ""}>
            <Link to={to} {...props}>
                {children}
            </Link>
        </li>
    )
}