

import { Route, Routes } from 'react-router'
import './App.css'
import Navbar from './component/Navbar'
import AddProduct from './component/AddProduct'
import EditProduct from './component/EditProduct'

function App() {
  

  return (
    <>
<Navbar/>
<Routes>
  <Route path='/' element={<Home/>}></Route>
  <Route path='/addProduct' element={<AddProduct/>}></Route>
  <Route path='/editProduct' element={<EditProduct/>}></Route>
</Routes>
</>
  )
}

export default App
