import React from 'react'

export interface Props extends React.HTMLAttributes<HTMLHeadElement> {}

const H4 = ({ children, ...props }: Props) => {
	return <h4 {...props}>{children}</h4>
}

export default H4
