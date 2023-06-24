import React from 'react'

export interface Props extends React.HTMLAttributes<HTMLHeadElement> {}

const H1 = ({ children, ...props }: Props) => {
	return <h1 {...props}>{children}</h1>
}

export default H1
