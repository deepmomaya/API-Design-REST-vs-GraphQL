# API Design – REST vs GraphQL – Student Course Management

This project demonstrates the difference between REST API and GraphQL using a Student–Course management example built with Java Spring Boot.

It exposes the same data model (Students and Courses) using both REST endpoints and GraphQL queries so that developers can clearly understand how each API style works and how they differ. The application uses in-memory data to keep the focus entirely on API design rather than database configuration.

---

## What is a REST API?

REST (Representational State Transfer) is an architectural style for designing web services. In REST:

- Resources are identified using URLs.
- Each resource has its own endpoint.
- Standard HTTP methods are used (GET, POST, PUT, DELETE).
- The server returns a fixed structure of data.

### Example REST Endpoints in This Project

GET /api/students  
GET /api/students/{id}

The response always contains the full Student object (id, name, email, courses). The client does not control which fields are returned.

### REST Characteristics

- Multiple endpoints for different resources  
- Fixed response structure  
- Simple and widely adopted  
- Easy to test using tools like Postman or browser  

### REST Limitations

- Over-fetching (receiving more data than needed)  
- Under-fetching (needing multiple API calls to get related data)  
- Less flexible for complex or nested data  

---

## What is a GraphQL API?

GraphQL is a query language for APIs that allows clients to request exactly the data they need. Instead of multiple endpoints, GraphQL typically exposes a single endpoint.

Clients define the structure of the response using queries.

### GraphQL Endpoint in This Project

POST /graphql

Example query:

```graphql
query {
  student(id: 1) {
    name
    courses {
      title
    }
  }
}
```

This query only returns the student's name and the titles of their courses — nothing else.

### GraphQL Characteristics

- Single endpoint  
- Client controls response structure  
- Supports nested queries  
- Strongly typed schema definition  

### GraphQL Limitations

- Slightly more complex setup  
- Requires schema design  
- Learning curve for teams unfamiliar with it  

---

## REST vs GraphQL – Comparison

| Feature              | REST                           | GraphQL                              |
|----------------------|--------------------------------|---------------------------------------|
| Endpoints            | Multiple endpoints             | Single endpoint                      |
| Data Fetching        | Fixed response structure       | Client chooses fields                |
| Over-fetching        | Possible                       | Avoided                              |
| Nested Data          | Multiple requests often needed | Single query can fetch nested data   |
| Setup Complexity     | Simple                         | Moderate                             |

### Key Difference

With REST, the server defines the shape of the response.  
With GraphQL, the client defines the shape of the response.
