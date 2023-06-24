import React from 'react'

export interface Props extends React.HTMLAttributes<HTMLHeadElement> {}

const H5 = ({ children, ...props }: Props) => {
	return <h5 {...props}>{children}</h5>
}

export default H5
