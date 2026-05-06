# prism-plat-policy-gate

`prism-plat-policy-gate` keeps a focused Java implementation around platform engineering. The project goal is to package a Java local lab for policy analysis with layout fixtures, stable geometry snapshots, and documented operating limits.

## Why It Exists

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how rollout width and route drift should influence a review result.

## Prism Plat Policy Gate Review Notes

The first comparison I would make is `quota pressure` against `rollout width` because it shows where the rule is most opinionated.

## Features

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/prism-plat-policy-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `quota pressure` and `rollout width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture Notes

The fixture data drives the tests. The code stays thin, while `metadata/domain-review.json` and `config/review-profile.json` explain what each case is meant to protect.

The Java code keeps the review rule close to the tests.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The check exercises the source code and the review fixture. `stress` is the high score at 185; `baseline` is the low score at 165.

## Limitations And Roadmap

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
