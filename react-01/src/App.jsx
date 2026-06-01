import { useState } from "react";

function App() {
  const [count, setCount] = useState(0);

  function increase() {
    setCount(prevCount => prevCount + 1);
  }

  function decrease() {
    setCount(prevCount => (prevCount > 0 ? prevCount - 1 : 0));
  }

  function reset() {
    setCount(0);
  }

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>{count}</h1>

      <button onClick={increase}>Increase</button>

      <button onClick={decrease} style={{ marginLeft: "10px" }}>
        Decrease
      </button>

      <button onClick={reset} style={{ marginLeft: "10px" }}>
        Reset
      </button>
    </div>
  );
}

export default App;